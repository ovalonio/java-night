package practiso;

public class PolymorphismClass {
    public static void main(String[] args) {
        
    }
}

class Department{

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
