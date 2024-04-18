import javax.swing.JOptionPane;
public class Calculadora {
   
public static void sumar(){
    String a = JOptionPane.showInputDialog(" Ingrese un numero ");
    double num1 = Double.parseDouble(a);
    String b = JOptionPane.showInputDialog("Ingrese el segundo numero");
    double num2 = Double.parseDouble(b);
    double suma = num1+num2;
    JOptionPane.showMessageDialog(null, "EL RESULTADO DE LA SUMA ES: "+ suma);
    }

public static void restar(){
    String a = JOptionPane.showInputDialog(" Ingrese un numero ");
    int num1 = Integer.parseInt(a);
    String b = JOptionPane.showInputDialog("Ingrese el segundo numero");
    int num2 = Integer.parseInt(b);
    double resta = num1+num2;
    JOptionPane.showMessageDialog(null, "EL RESULTADO DE LA RESTA ES: "+ resta);
    }

public static void multiplicar(){
    String a = JOptionPane.showInputDialog(" Ingrese un numero ");
    int num1 = Integer.parseInt(a);
    String b = JOptionPane.showInputDialog("Ingrese el segundo numero");
    int num2 = Integer.parseInt(b);
    double multiplicacion = num1+num2;
    JOptionPane.showMessageDialog(null, "EL RESULTADO DE LA MULTIPLICACION ES: "+ multiplicacion);
    }

public static void dividir(){
    String a = JOptionPane.showInputDialog(" Ingrese un numero ");
    int num1 = Integer.parseInt(a);
    String b = JOptionPane.showInputDialog("Ingrese el segundo numero");
    int num2 = Integer.parseInt(b);
    double division = num1+num2;
    JOptionPane.showMessageDialog(null, "EL RESULTADO DE LA DIVISION ES: "+ division);
    }
        
    public static void main(String[] args) {
        // menu de opciones
      String menu = " CALCULADORA \n"+
                    " 1.Sumar \n"+
                    " 2.Restar \n"+
                    " 3.Multiplicar \n"+
                    " 4.Dividir \n"+
                    " 5.Salir \n"+
                    " seleccione una de las opciones ";
      
    String optiMenu = JOptionPane.showInputDialog(menu);
    int opciones = Integer.parseInt(optiMenu);
    
    switch (opciones){
        case 1:
            sumar();
            break;
        case 2:
            restar();
            break;
        case 3:
            multiplicar();
            break;
        case 4:
            dividir();
            break;
        case 5:
            JOptionPane.showInputDialog("adios");
            
    }
    }
    
}
