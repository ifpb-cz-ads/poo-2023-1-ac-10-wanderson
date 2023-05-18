public class HierarquiaAnimais {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.emitirSom();

        Mamifero mamifero = new Mamifero();
        mamifero.emitirSom();

        Cachorro cachorro = new Cachorro();
        cachorro.emitirSom();

        Gato gato = new Gato();
        gato.emitirSom();

        Reptil reptil = new Reptil();
        reptil.emitirSom();

        Cobra cobra = new Cobra();
        cobra.emitirSom();
    }
}

class Animal {
    public void emitirSom() {
        System.out.println("O animal emitiu um som.");
    }
}

class Mamifero extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O mamífero emitiu um som.");
    }
}

class Reptil extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("O réptil emitiu um som.");
    }
}

class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("O cachorro latiu.");
    }
}

class Gato extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("O gato miou.");
    }
}

class Cobra extends Reptil {
    @Override
    public void emitirSom() {
        System.out.println("A cobra sibilou.");
    }
}