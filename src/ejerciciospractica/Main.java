package ejerciciospractica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double salarioNuevo;
        Empleado empleado1 = new Empleado();
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingresar el nombre del empleado");
        empleado1.setNombre(reader.nextLine());
        System.out.println("Ingresar el salario del empleado");
        empleado1.setSalario(Double.parseDouble(reader.nextLine()));
        System.out.println("Ingresar el departamento del empleado");
        empleado1.setDepartamento(reader.nextLine());
        System.out.println("Ingresar el años laborando que tiene el empleado");
        empleado1.setAniosLaborando(Integer.parseInt(reader.nextLine()));
        
        if ((empleado1.getSalario()>1200)&&("computo".equals(empleado1.getDepartamento()))) {
            salarioNuevo = empleado1.getSalario()+(empleado1.getSalario()*0.06);
            empleado1.setSalario(salarioNuevo);
        } else {
            if(!(empleado1.getAniosLaborando()>15)){
                salarioNuevo = empleado1.getSalario()-(empleado1.getSalario()*0.03);
                empleado1.setSalario(salarioNuevo);
            }
        }
        
        System.out.println("Empleado: " + empleado1.getNombre());
        System.out.println("Departamento: " + empleado1.getDepartamento());
        System.out.println("Años de servicio: " + empleado1.getAniosLaborando());
        System.out.println("Salario: " + Math.round(empleado1.getSalario()*100)/100d);
    }
}
