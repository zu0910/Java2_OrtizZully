/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package patronesdiseno_estructurales.decorator;

/*
DECORATOR ( Decorator)
Añade funcionalidades a un objeto sin modificar su estructura

Ejemplo: Agregar caracteristicas extra a un cafe
 */
public class Patronesdiseno_estructuralesDecorator {

    //Componente base
    interface Coffee { //usages 3 implementaciones
        String getDescription(); //4 usages 3 implementaciones
        double cost(); //4 usages 3 implementaciones
    }

    //Implementación base
    static class SimpleCoffee implements Coffee { //1 usage
        public String getDescription() { //4 usages
            return "Café simple";
        }

        public double cost() { //4 usages
            return 5.0;
        }
    }

    //Decorador abstracto
    static abstract class CoffeeDecorator implements Coffee { //1 usage
        protected Coffee coffee; //5 usages

        public CoffeeDecorator(Coffee coffee) { //1 usage
            this.coffee = coffee;
        }

        public String getDescription() { //4 usages 1 override
            return coffee.getDescription();
        }

        public double cost() { //4 usages
            return 5.0;
        }
    }

    //Decorador concreto
    static class MilkDecorator extends CoffeeDecorator { //1 usage
        public MilkDecorator(Coffee coffee) { //1 usage
            super(coffee);
        }

        public String getDescription() { //1 usage
            return coffee.getDescription() + ", con leche";
        }

        public double cost() { //1 usage
            return coffee.cost() + 1.5;
        }
    }

    //Uso del patron Decorador
    public static void main(String[] args) {
        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());

        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDescription() + " $" + myCoffee.cost());
    }
}
    
    
    

