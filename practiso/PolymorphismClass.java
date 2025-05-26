package practiso;

public class PolymorphismClass {
    public static void main(String[] args) {
        HR.Training_And_Development(new Sales());
            
        
        
    }
}

class Department{
    public String getName(){
        return getClass().getSimpleName();
    }
}

class IT extends Department{
    
}

class Sales extends Department{

}

interface IT_Support{

}

interface HelpDesk{

}

class Manage_IT_Ticket implements IT_Support, HelpDesk{

}

class Infrastructure implements IT_Support{

}

class HR{
    public static void Training_And_Development(Department department){
        System.out.println("List of new trainee: " + department.getName());
    }
}