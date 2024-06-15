/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyectosistema;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author vboxuser
 */
public class ProyectoSistema {
    public static ArrayList<Docenteclass> docentes=new ArrayList<>();
    public static ArrayList<Alumnoclass> alumnos=new ArrayList<>();
    public static ArrayList<Cursoclass> curso=new ArrayList<>();
    
    public static Docenteclass docenteLogeado=new Docenteclass();
    public static Alumnoclass alumnoLogeado=new Alumnoclass();
    public static Cursoclass cursoLogeado=new Cursoclass();

    public static void main(String[] args) {
        Login loginmenu=new Login();
        loginmenu.setVisible(true);
    }
    
    public static boolean ValidacionContraseña(String contraseña){
        String Requicitos="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[-_*!=+&^%$#@])(?=\\S+$).{8,}$";
        Pattern pattern=Pattern.compile(Requicitos);
        Matcher matcher=pattern.matcher(contraseña);
        return matcher.matches();
    }
}
