package fr.loyat.kata4;

public class Singleton {
 
    private static final Singleton INSTANCE = new Singleton();
    private static Boolean cree = true;
    public static Singleton getInstance() {
        return INSTANCE;
    }
 
    private Singleton() {
    	System.out.println("créé = " + cree);
    	if (cree==Boolean.TRUE) throw new RuntimeException("Merci de passer par getInstance"); 
    }
 
    public void sayHello() {
        System.out.println("Hello World !");
    }
 
}


/*
try {
Class<Singleton> sing = Singleton.class;
Constructor<Singleton>[] constr = (Constructor<Singleton>[]) sing.getDeclaredConstructors();
try {
	Singleton.getInstance().sayHello();
	constr[0].setAccessible(true);
	Singleton singleton = constr[0].newInstance(null);
	singleton.sayHello();
	System.out.println(Singleton.getInstance().equals(singleton));
} catch (InstantiationException | IllegalAccessException
		| IllegalArgumentException | InvocationTargetException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
} catch (SecurityException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}*/