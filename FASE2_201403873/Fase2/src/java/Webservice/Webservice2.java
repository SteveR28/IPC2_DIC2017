/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Webservice;

import Conexion.ConexionBD;
import Logica.login;
import java.sql.Connection;
import java.sql.Statement;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author USER
 */
@WebService(serviceName = "Webservice2")
public class Webservice2 {

    ConexionBD conex = new ConexionBD();

    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    public Boolean Login(@WebParam(name = "Usuario") String Usuario, @WebParam(name = "Contrasena") String Contraseña, @WebParam(name = "cui") String cui) {
//return "HOLA";
        return (new login().logearse(Usuario, Contraseña, cui));

    }

    @WebMethod(operationName = "CrearUsuario")
    public String CrearUsuario(@WebParam(name = "nickname") String nickname, @WebParam(name = "nombre") String nombre, @WebParam(name = "correo") String correo, @WebParam(name = "fechaNacimiento") String fechaNacimiento, @WebParam(name = "contra") String contra) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            consulta = query.executeUpdate("INSERT INTO usuario (nickname, nombre, correo, fecha_nac, contra)"
                    + //aqui va como lo puse en mariaDB
                    "VALUES('" + nickname + "','" + nombre + "', '" + correo + "', '" + fechaNacimiento + "', '" + contra + "');");
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;
    }

    @WebMethod(operationName = "CrearProyecto")
    public String CrearProyecto(@WebParam(name = "cod_pro") int cod_pro, @WebParam(name = "nombre") String nombre, @WebParam(name = "fecha_i") String fecha_i, @WebParam(name = "fecha_f") String fecha_f, @WebParam(name = "pago") int pago, @WebParam(name = "nickname") String nickname) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            //consulta = query.executeUpdate("SELECT nombre FROM patrocinador");
            consulta = query.executeUpdate("INSERT INTO proyecto (cod_pro, nombre, fecha_i, fecha_f, pago, nickname)"
                    + "VALUES(" + cod_pro + ",'" + nombre + "','" + fecha_i + "','" + fecha_f + "'," + pago + ",'" + nickname + "');");
            //si es texto va entre '""' y si es numero ""
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;
    }

    @WebMethod(operationName = "CrearTareaIndividual")
    public String CrearTareaIndividual(@WebParam(name = "cod_tarea") int cod_tarea, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "fecha_i") String fecha_i, @WebParam(name = "requisitos") String requisitos, @WebParam(name = "pago") int pago, @WebParam(name = "nickname") String nickname) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            //consulta = query.executeUpdate("SELECT nombre FROM patrocinador");
            consulta = query.executeUpdate("INSERT INTO tarea_individual (cod_tarea, nombre, descripcion, fecha_i, requisitos, pago, nickname)"
                    + "VALUES(" + cod_tarea + ",'" + nombre + "','" + descripcion + "','" + fecha_i + "', '" + requisitos + "', " + pago + ",'" + nickname + "');");
            //si es texto va entre '""' y si es numero ""
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;
    }

    @WebMethod(operationName = "CrearTareaProyecto")
    public String CrearTareaProyecto(@WebParam(name = "cod_tarea") int cod_tarea, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "fecha_i") String fecha_i, @WebParam(name = "requisitos") String requisitos, @WebParam(name = "pago") int pago, @WebParam(name = "cod_pro") int cod_pro) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            //consulta = query.executeUpdate("SELECT nombre FROM patrocinador");
            consulta = query.executeUpdate("INSERT INTO detalle_ta (cod_tarea, nombre, descripcion, fecha_i, requisitos, pago, cod_pro)"
                    + "VALUES(" + cod_tarea + ",'" + nombre + "','" + descripcion + "','" + fecha_i + "', '" + requisitos + "', " + pago + "," + cod_pro + ");");
            //si es texto va entre '""' y si es numero ""
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;

    }

    @WebMethod(operationName = "IngresarHabilidad")
    public String IngresarHabilidad(@WebParam(name = "cod_hab") int cod_hab, @WebParam(name = "nombre") String nombre, @WebParam(name = "resumen") String resumen, @WebParam(name = "nickname") String nickname, @WebParam(name = "karma") String karma) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            //consulta = query.executeUpdate("SELECT nombre FROM patrocinador");
            consulta = query.executeUpdate("INSERT INTO habilidad (cod_hab, nombre, resumen, nickname, karma)"
                    + "VALUES(" + cod_hab + ",'" + nombre + "','" + resumen + "', '" + nickname + "'," + karma + ");");
            //si es texto va entre '""' y si es numero ""
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;
    }

    @WebMethod(operationName = "IngresarConocimiento")
    public String IngresarConocimiento(@WebParam(name = "cod_cono") int cod_cono, @WebParam(name = "nombre") String nombre, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "cod_hab") int cod_hab) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            //consulta = query.executeUpdate("SELECT nombre FROM patrocinador");
            consulta = query.executeUpdate("INSERT INTO conocimiento (cod_cono, nombre, descripcion, cod_hab)"
                    + "VALUES(" + cod_cono + ",'" + nombre + "','" + descripcion + "'," + cod_hab + ");");
            //si es texto va entre '""' y si es numero ""
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;
    }

    @WebMethod(operationName = "CrearAsociacion")
    public String CrearAsociacion(@WebParam(name = "cod_aso") int cod_aso, @WebParam(name = "nombre") String nombre, @WebParam(name = "resumen") String resumen, @WebParam(name = "logo") String logo) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            consulta = query.executeUpdate("Insert Into asociacion (cod_aso, nombre, resumen, logo)"
                    + //aqui va como lo puse en mariaDB
                    "Values(" + cod_aso + ",'" + nombre + "', '" + resumen + "', '" + logo + "');");
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;
    }

    @WebMethod(operationName = "EnviarInvitacion")
    public String EnviarInvitacion(@WebParam(name = "cod_inv") int cod_inv, @WebParam(name = "cod_aso") int cod_aso, @WebParam(name = "nickname") String nickname) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            //consulta = query.executeUpdate("SELECT nombre FROM patrocinador");
            consulta = query.executeUpdate("INSERT INTO invitacion (cod_inv, cod_aso, nickname)"
                    + "VALUES(" + cod_inv + "," + cod_aso + ",'" + nickname + "');");
            //si es texto va entre '""' y si es numero ""
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;
    }

    @WebMethod(operationName = "IngresarEstado")
    public String IngresarEstado(@WebParam(name = "no_estado") int no_estado, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "nickname") String nickname) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            //consulta = query.executeUpdate("SELECT nombre FROM patrocinador");
            consulta = query.executeUpdate("INSERT INTO estado (no_estado, descripcion, nickname)"
                    + "VALUES(" + no_estado + ",'" + descripcion + "','" + nickname + "');");
            //si es texto va entre '""' y si es numero ""
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;
    }

    @WebMethod(operationName = "IngresarComentario")
    public String IngresarComentario(@WebParam(name = "no_comentario") int no_comentario, @WebParam(name = "descripcion") String descripcion, @WebParam(name = "no_estado") int no_estado) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            //consulta = query.executeUpdate("SELECT nombre FROM patrocinador");
            consulta = query.executeUpdate("INSERT INTO comentario (no_comentario, descripcion, no_estado)"
                    + "VALUES(" + no_comentario + ",'" + descripcion + "'," + no_estado + ");");
            //si es texto va entre '""' y si es numero ""
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;
    }

    @WebMethod(operationName = "EnviarMensaje")
    public String EnviarMensaje(@WebParam(name = "cod_mensaje") int cod_mensaje, @WebParam(name = "contenido") String contenido, @WebParam(name = "recibe_u") String recibe_u, @WebParam(name = "nikcname") String nickname) {
        ConexionBD conec = new ConexionBD();
        Connection conexion = conec.getDBConection();
        int consulta = 0;
        String consulta1 = "";
        try {
            Statement query = conexion.createStatement();
            //consulta = query.executeUpdate("SELECT nombre FROM patrocinador");
            consulta = query.executeUpdate("INSERT INTO mensaje (cod_mensaje, contenido, recibe_u, nickname)"
                    + "VALUES("+cod_mensaje+",'" + contenido + "','" + recibe_u + "','" + nickname + "');");
            //si es texto va entre '""' y si es numero ""
            conexion.close();
        } catch (Exception ex) {
            System.out.println("conexion incorrecta" + ex);
        }

        return consulta1;
    }
}
