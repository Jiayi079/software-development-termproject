package question1;

class Cow implements Animal{
    @Override
    public String makeSound() {
        return "moo";
    }
}

class Lion implements Animal{
    @Override
    public String makeSound() {
        return "roar";
    }
}

class Wolf implements Animal{
    @Override
    public String makeSound() {
        return "howl";
    }
}


public class AnimalFactory {
    public static Animal makeAnimal(String type){
        switch (type) {
            case "Cow":
                return new Cow();
            case "Lion":
                return new Lion();
            case "Wolf":
                return new Wolf();
        }
        return null;
    }
}
