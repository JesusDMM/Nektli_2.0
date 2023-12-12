package nektli;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.sql.*;
import java.util.Scanner;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class bd {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    static LocalDate now = LocalDate.now();
    static String date = now.format(formatter);
    static Connection con;
    static PreparedStatement ps;
    static Statement st;
    static ResultSet rs;
    static boolean bandera = false;

    public bd() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Nektli", "root", "JESUSdaniel444");
            st = con.createStatement();
            ps = con.prepareStatement("INSERT INTO usuario VALUES (?,?)");
            rs = st.executeQuery("select * from Usuarios");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
    public static DefaultTableModel Tabla_General(DefaultTableModel modelo, int id_usuario) {
        String arreglo[] = new String[13];
        try {
            st = con.createStatement();
            rs = st.executeQuery("select * from colmenas where Id_usuario = " + id_usuario);
            while (rs.next()) {
                arreglo[0] = rs.getInt(1)+"";
                arreglo[1] = rs.getString(2);
                arreglo[2] = rs.getInt(3)+"";
                arreglo[3] = rs.getInt(4)+"";
                arreglo[4] = rs.getString(5);
                arreglo[5] = rs.getString(6);
                arreglo[6] = rs.getString(7);
                arreglo[7] = rs.getString(8);
                arreglo[8] = rs.getString(9);
                arreglo[9] = rs.getDouble(10)+"";
                arreglo[10] = rs.getDouble(11)+"";
                arreglo[11] = rs.getString(12);
                arreglo[12] = rs.getString(13);
                modelo.addRow(arreglo);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("El error es " + e);
        }
        return modelo;
    }
    
    public int Inicio_Sesion(String Nombre, String Contraseña) {
        try {
            ps = con.prepareStatement("Select * from USUARIOS where CORREO = ? and Contraseña = ?");
            ps.setString(1, Nombre);
            ps.setString(2, Contraseña);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt("id");
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return 0;
    }
    //nombre de la colmena y la cantidad total de cosechas de productos que no sean miel
    public Vector<String> cosechas_barra() {
        Vector<String> Nombre_cantidad = new Vector<String>();
        try {
            ps = con.prepareStatement("select Nombre_colmena, sum(Cantidad) as numero from cosechas as c join tareas as t on c.id_Tarea = t.Id where c.Producto != 'Miel' group by Nombre_colmena");
            rs = ps.executeQuery();
            while (rs.next()) {
                Nombre_cantidad.add(rs.getString("Nombre_colmena"));
                Nombre_cantidad.add(rs.getInt("numero") + "");
            }
            return Nombre_cantidad;
        } catch (Exception e) {
            System.err.print(e);
        }
        return Nombre_cantidad;
    }
    //nombre de la colmenas y la cantidad de veces que se realizo una alimentacion
    public Vector<String> alimentaciones_barra() {
        Vector<String> Nombre_cantidad = new Vector<String>();
        try {
            ps = con.prepareStatement("select Nombre_colmena, count(*) as numero from alimentaciones as a join tareas as t on a.id_Tarea = t.Id group by Nombre_colmena");
            rs = ps.executeQuery();
            while (rs.next()) {
                Nombre_cantidad.add(rs.getString("Nombre_colmena"));
                Nombre_cantidad.add(rs.getInt("numero") + "");
            }
            return Nombre_cantidad;
        } catch (Exception e) {
            System.err.print(e);
        }
        return Nombre_cantidad;
    }
    //nombre de la colmena y la cantidad de tratamientos de la colmena
    public Vector<String> tratamientos_barras() {
        Vector<String> Nombre_cantidad = new Vector<String>();
        try {
            ps = con.prepareStatement("select Nombre_colmena, count(*) as numero from tratamientos as tra join tareas as t on tra.id_Tarea = t.Id group by Nombre_colmena");
            rs = ps.executeQuery();
            while (rs.next()) {
                Nombre_cantidad.add(rs.getString("Nombre_colmena"));
                Nombre_cantidad.add(rs.getInt("numero") + "");
            }
            return Nombre_cantidad;
        } catch (Exception e) {
            System.err.print(e);
        }
        return Nombre_cantidad;
    }
    
    //nombre de la colmena y la cantidad de pura miel sacada
    public Vector<String> miel_colmenas_pastel() {
        Vector<String> Nombre_cantidad = new Vector<String>();
        try {
            ps = con.prepareStatement("select Nombre_colmena, sum(Cantidad) as numero from cosechas as c join tareas as t on c.id_Tarea = t.Id where c.Producto = 'Miel' group by Nombre_colmena");
            rs = ps.executeQuery();
            while (rs.next()) {
                Nombre_cantidad.add(rs.getString("Nombre_colmena"));
                Nombre_cantidad.add(rs.getInt("numero") + "");
            }
            return Nombre_cantidad;
        } catch (Exception e) {
            System.err.print(e);
        }
        return Nombre_cantidad;
    }

    public static int Buscar_Colmena(String Nombre, int id) {
        try {
            rs = st.executeQuery("select id from Colmenas where Nombre = '" + Nombre + "' and Id_usuario = " + id);
            while (rs.next()) {
                return rs.getInt("Id");
            }
        } catch (Exception e) {

        }
        return 0;
    }

    public static boolean Buscar_Correo_Usuario(String Correo) {
        try {
            ps = con.prepareStatement("Select * from USUARIOS where CORREO = ?");
            ps.setString(1, Correo);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }
    
    public static String Buscar_contarseña_Usuario(String Correo) {
        try {
            ps = con.prepareStatement("Select contraseña from USUARIOS where CORREO = ?");
            ps.setString(1, Correo);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getString("Contraseña");
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return "No se encontro contraseña";
    }
    
    public static boolean Ingresar_Usuario(String Nombre, String Ocupaccion, String Correo, String Contraseña) {
        try {
            ps = con.prepareStatement("INSERT INTO Cuentas VALUES (?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, Nombre);
            ps.setString(3, Ocupaccion);
            ps.setString(4, Correo);
            ps.setString(5, Contraseña);
            ps.executeUpdate();
            ps = con.prepareStatement("INSERT INTO Usuarios VALUES (?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, Correo);
            ps.setString(3, Contraseña);
            ps.execute();
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public static boolean Insertar_Colmena(String nombre, int n_alzas, int n_bastidores, String tipo, String suelo, String proteccion, String estado, String fecha,
            double longitud, double latitud, String ciudad, String descripcion, int id_usuario) {
        try {
            int id_colmena = 0;
            ps = con.prepareStatement("INSERT INTO Colmenas VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setString(2, nombre);
            ps.setInt(3, n_alzas);
            ps.setInt(4, n_bastidores);
            ps.setString(5, tipo);
            ps.setString(6, suelo);
            ps.setString(7, proteccion);
            ps.setString(8, estado);
            ps.setString(9, fecha);
            ps.setDouble(10, longitud);
            ps.setDouble(11, latitud);
            ps.setString(12, ciudad);
            ps.setString(13, descripcion);
            ps.setInt(14, id_usuario);
            ps.executeUpdate();
            //insert into Tareas values (0,1,1,'A1','Producción')
            rs = st.executeQuery("select id from Colmenas where Nombre = '" + nombre + "' and Id_usuario = " + id_usuario);
            while (rs.next()) {
                id_colmena = rs.getInt("Id");
            }
            ps = con.prepareStatement("INSERT INTO Tareas VALUES (?,?,?,?,?)");
            ps.setInt(1, 0);
            ps.setInt(2, id_usuario);
            ps.setInt(3, id_colmena);
            ps.setString(4, nombre);
            ps.setString(5, tipo);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.err.print(e);
        }
        return false;
    }

    public static int Ingresar_Tratamiento(int id_Usuario, int id_Colmena, String fecha_inicial, String fecha_final,
            String enfermedad, String producto, double dosis, int repeticiones, String persona) {
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("INSERT INTO Tratamientos VALUES (?,?,?,?,?,?,?,?)");
            ps.setInt(1, id_Tarea);
            ps.setString(2, fecha_inicial);
            ps.setString(3, fecha_final);
            ps.setString(4, enfermedad);
            ps.setString(5, producto);
            ps.setDouble(6, dosis);
            ps.setInt(7, repeticiones);
            ps.setString(8, persona);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static int Actualiza_Tratamiento(int id_Usuario, int id_Colmena, String fecha_inicial, String fecha_final,
            String enfermedad, String producto, double dosis, int repeticiones, String persona) {
        //verificar si es necesario buscar el usuario :)
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("update tratamientos \n"
                    + "set Fecha_I = '?' ,\n"
                    + "Fecha_F = '?',\n"
                    + "Enfermedad = '?',\n"
                    + "Producto = '?',\n"
                    + "Dosis = ? \n"
                    + "Repeticiones_Dia = ? \n"
                    + "Encargado = '?'\n"
                    + "where id_Tarea = ?;");
            ps.setString(1, fecha_inicial);
            ps.setString(2, fecha_final);
            ps.setString(3, enfermedad);
            ps.setString(4, producto);
            ps.setDouble(5, dosis);
            ps.setInt(6, repeticiones);
            ps.setString(7, persona);
            ps.setInt(8, id_Tarea);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static int Insertar_Cosecha(int id_Usuario, int id_Colmena, String fecha, String producto, double cantidad, String descripcion) {
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("INSERT INTO Cosechas VALUES (?,?,?,?,?)");
            ps.setInt(1, id_Tarea);
            ps.setString(2, fecha);
            ps.setString(3, producto);
            ps.setDouble(4, cantidad);
            ps.setString(5, descripcion);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static int Actualizar_Cosecha(int id_Usuario, int id_Colmena, String fecha, String producto, double cantidad, String descripcion) {
        //verificar si es necesario buscar el id de la tarea
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("update cosechas \n"
                    + "set Fecha = '?',\n"
                    + "Producto = '?',\n"
                    + "Cantidad = ?,\n"
                    + "Descripcion = '?'\n"
                    + "where id_Tarea = ?;");
            ps.setString(1, fecha);
            ps.setString(2, producto);
            ps.setDouble(3, cantidad);
            ps.setString(4, descripcion);
            ps.setInt(5, id_Tarea);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static int Insertar_alimentacion(int id_Usuario, int id_Colmena, String fecha, String alimento, String tipo, double cantidad, int cantidad_dias,
            String descripcion) {
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("INSERT INTO Alimentaciones VALUES (?,?,?,?,?,?,?)");
            ps.setInt(1, id_Tarea);
            ps.setString(2, fecha);
            ps.setString(3, tipo);
            ps.setString(4, alimento);
            ps.setDouble(5, cantidad);
            ps.setDouble(6, cantidad_dias);
            ps.setString(7, descripcion);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static int Actualizar_alimentacion(int id_Usuario, int id_Colmena, String fecha, String alimento, String tipo, double cantidad, int cantidad_dias,
            String descripcion) {
        //Verificar si es necesario buscar el id de la tarea
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("update alimentaciones \n"
                    + "set Fecha = '?',\n"
                    + "Tipo = '?',\n"
                    + "Alimento = '?',\n"
                    + "Cantidad = ?,\n"
                    + "Cantidad_Dias = ?,\n"
                    + "Descripcion = '?'\n"
                    + "where id_Tarea = ?;");
            ps.setString(1, fecha);
            ps.setString(2, tipo);
            ps.setString(3, alimento);
            ps.setDouble(4, cantidad);
            ps.setDouble(5, cantidad_dias);
            ps.setString(6, descripcion);
            ps.setInt(7, id_Tarea);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static DefaultTableModel Tabla_Tareas(DefaultTableModel modelo, int id_usuario, int id_Colmena) {
        String arreglo[] = new String[5];
        try {
            st = con.createStatement();
            rs = st.executeQuery("select tar.Nombre_colmena, count(t.id_tarea) as N_Tratamientos, count(c.id_tarea) as N_Cosechas, count(a.id_tarea) as N_Alimentacion, count(m.id_tarea) as N_Movimientos\n"
                    + "from tareas as tar left join Tratamientos as t on tar.ID = t.id_tarea\n"
                    + "left join Cosechas as c on tar.ID = c.id_tarea\n"
                    + "left join Alimentaciones as a on tar.ID = a.id_tarea\n"
                    + "left join Movimientos as m on tar.ID = m.id_Tarea\n"
                    + "where tar.id_Usuario = " + id_usuario + " and tar.id_Colmena = " + id_Colmena + " "
                    + "group by tar.Nombre_colmena");
            while (rs.next()) {
                arreglo[0] = rs.getString(1);
                arreglo[1] = rs.getInt(2) + "";
                arreglo[2] = rs.getInt(3) + "";
                arreglo[3] = rs.getInt(4) + "";
                arreglo[4] = rs.getInt(5) + "";
                modelo.addRow(arreglo);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("El error es " + e);
        }
        return modelo;
    }

    public static DefaultTableModel Tabla_Tratamiento(DefaultTableModel modelo, int id_usuario, int id_Colmena) {
        String arreglo[] = new String[8];
        try {
            st = con.createStatement();
            rs = st.executeQuery("select ta.Nombre_colmena, t.Fecha_I, t.Fecha_F, t.Enfermedad, t.Producto, t.Dosis, t.Repeticiones_Dia, t.Encargado\n"
                    + "from Tratamientos as t inner join Tareas as ta on t.id_Tarea = ta.Id \n"
                    + "where ta.id_Usuario = " + id_usuario + " and ta.id_Colmena = " + id_Colmena);
            while (rs.next()) {
                arreglo[0] = rs.getString(1);
                arreglo[1] = rs.getString(2);
                arreglo[2] = rs.getString(3);
                arreglo[3] = rs.getString(4);
                arreglo[4] = rs.getString(5);
                arreglo[5] = rs.getDouble(6) + "";
                arreglo[6] = rs.getInt(7) + "";
                arreglo[7] = rs.getString(8);
                modelo.addRow(arreglo);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("El error es " + e);
        }
        return modelo;
    }

    public static DefaultTableModel Tabla_Alimentaciones(DefaultTableModel modelo, int id_usuario, int id_Colmena) {
        String arreglo[] = new String[7];
        try {
            st = con.createStatement();
            rs = st.executeQuery("select ta.Nombre_colmena, t.Fecha, t.Tipo, t.Alimento, t.Cantidad, t.Cantidad_Dias, t.Descripcion\n"
                    + "from Alimentaciones as t inner join Tareas as ta on t.id_Tarea = ta.Id \n"
                    + "where ta.id_Usuario = " + id_usuario + " and ta.id_Colmena = " + id_Colmena);
            while (rs.next()) {
                arreglo[0] = rs.getString(1);
                arreglo[1] = rs.getString(2);
                arreglo[2] = rs.getString(3);
                arreglo[3] = rs.getString(4);
                arreglo[4] = rs.getDouble(5) + "";
                arreglo[5] = rs.getDouble(6) + "";
                arreglo[6] = rs.getString(7);
                modelo.addRow(arreglo);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("El error es " + e);
        }
        return modelo;
    }

    public static DefaultTableModel Tabla_Cosechas(DefaultTableModel modelo, int id_usuario, int id_Colmena) {
        String arreglo[] = new String[5];
        try {
            st = con.createStatement();
            rs = st.executeQuery("select ta.Nombre_colmena, t.Fecha, t.Producto, t.Cantidad, t.Descripcion\n"
                    + "from Cosechas as t inner join Tareas as ta on t.id_Tarea = ta.Id \n"
                    + "where ta.id_Usuario = " + id_usuario + " and ta.id_Colmena = " + id_Colmena);
            while (rs.next()) {
                arreglo[0] = rs.getString(1);
                arreglo[1] = rs.getString(2);
                arreglo[2] = rs.getString(3);
                arreglo[3] = rs.getDouble(4) + "";
                arreglo[4] = rs.getString(5);
                modelo.addRow(arreglo);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("El error es " + e);
        }
        return modelo;
    }

    public static DefaultTableModel Tabla_Movimientos(DefaultTableModel modelo, int id_usuario, int id_Colmena) {
        String arreglo[] = new String[6];
        try {
            st = con.createStatement();
            rs = st.executeQuery("select ta.Nombre_colmena, t.Fecha_Salida, t.Ciudad_Salida, t.Fecha_Llegada, t.Ciudad_Llegada, t.Motivo\n"
                    + "from Movimientos as t inner join Tareas as ta on t.id_Tarea = ta.Id \n"
                    + "where ta.id_Usuario = " + id_usuario+ " and ta.id_Colmena = "+ id_Colmena+";");
            while (rs.next()) {
                arreglo[0] = rs.getString(1);
                arreglo[1] = rs.getString(2);
                arreglo[2] = rs.getString(3);
                arreglo[3] = rs.getString(4);
                arreglo[4] = rs.getString(5);
                arreglo[5] = rs.getString(6);
                modelo.addRow(arreglo);
            }
            return modelo;
        } catch (Exception e) {
            System.out.println("El error es " + e);
        }
        return modelo;
    }

    public static int Insertar_Movimiento(int id_Usuario, int id_Colmena, String fecha_salida, String ciudad_salida, String fecha_llegada,
            String ciudad_llegada, String motivo) {
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("INSERT INTO Movimientos VALUES (?,?,?,?,?,?)");
            ps.setInt(1, id_Tarea);
            ps.setString(2, fecha_salida);
            ps.setString(3, ciudad_salida);
            ps.setString(4, fecha_llegada);
            ps.setString(5, ciudad_llegada);
            ps.setString(6, motivo);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

    public static int Actualizar_Movimiento(int id_Usuario, int id_Colmena, String fecha_salida, String ciudad_salida, String fecha_llegada,
            String ciudad_llegada, String motivo) {
        //Verificar si el necesario el buscar el id de la tarea
        int id_Tarea = 0;
        try {
            rs = st.executeQuery("select id from Tareas where id_Usuario = " + id_Usuario + " and id_Colmena = " + id_Colmena);
            while (rs.next()) {
                id_Tarea = rs.getInt("Id");
            }
            ps = con.prepareStatement("update movimientos\n"
                    + "set Fecha_Salida = '?',\n"
                    + "Ciudad_Salida = '?',\n"
                    + "Fecha_Llegada = '?',\n"
                    + "Ciudad_Llegada = '?',\n"
                    + "Motivo = '?'\n"
                    + "where id_Tarea = ?;");
            ps.setString(1, fecha_salida);
            ps.setString(2, ciudad_salida);
            ps.setString(3, fecha_llegada);
            ps.setString(4, ciudad_llegada);
            ps.setString(5, motivo);
            ps.setInt(6, id_Tarea);
            ps.executeUpdate();
            return 1;
        } catch (Exception e) {
            System.out.println(e);
        }
        return 0;
    }

}
