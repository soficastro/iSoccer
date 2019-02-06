public  class Main
{
    public static void main(String[] args)
    {
        Admin administrator = new Admin();
        boolean logged = false;
        ArrayList<People> employees = new ArrayList<>();
        People president = new President;
        ArrayList<People> fans = new ArrayList<>();
        ArrayList<Resource> physicalResources = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        boolean process;
        process = true;

        while(process)
        {
            int operation;

            try
            {
                System.out.println("Welcome! How do you like to continue?\nPress 1 to LOGIN AS ADMIN. This way you can " +
                        "access the system\nPress 2 to EXIT");
                operation = input.nextInt();
                switch(operation)
                {
                    case 1:
                        logged = administrator.login();
                        break;
                    case 2:
                        process = false;
                        break;
                }
            }
            catch(InputMismatchException e)
            {
                System.out.println("Wrong input");
                input.next();
            }

            if(logged)
            {
                int log_operation;

                try
                {
                    System.out.println("Press 1 to ADD EMPLOYEE\nPress 2 to ADD or EDIT PARTNERS\nPress 3 to MANAGE" +
                            " PHYSICAL RESOURCES\nPress 4 for a REPORT");
                    log_operation = input.nextInt();
                    switch(log_operation)
                    {
                        case 1:
                            addEmployee(employees);
                            break;
                        case 2:
                            process = false;
                            break;
                    }
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Wrong input");
                    input.next();
                }
            }
        }
    }

    private void addEmployee(People employees)
    {
        Scanner input = new Scanner(System.in);
        int add_operation;

        try
        {
            System.out.println("Press 1 to ADD A PRESIDENT\nPress 2 to ADD or EDIT PARTNERS\nPress 3 to MANAGE" +
                    " PHYSICAL RESOURCES\nPress 4 for a REPORT");
            add_operation = input.nextInt();
            switch(add_operation)
            {
                case 1:
                    addPresident(employees); //incomplete
                    break;
                case 2:
                    addMedic(employees);
                    break;
            }
        }
        catch(InputMismatchException e)
        {
            System.out.println("Wrong input");
            input.next();
        }
    }

    private void addPresident(People employess)
    {
        Scanner input = new Scanner(System.in);
        String name;
        String email;
        int cpf;
        int phone;
        People newPres = new President;

        try
        {
            System.out.println("Enter Full Name");
            name = input.nextLine();
            System.out.println("Enter email");
            email = input.nextLine();
            System.out.println("Enter CPF");
            cpf = input.nextInt();
            System.out.println("Enter telephone number");
            number = input.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Wrong input");
        }
    }

    private void addMedic(People employess)
    {
        Scanner input = new Scanner(System.in);
        String name;
        String email;
        int cpf;
        int phone;
        int crm
        People newDoc = new Medic;

        try
        {
            System.out.println("Enter Full Name");
            name = input.nextLine();
            System.out.println("Enter email");
            email = input.nextLine();
            System.out.println("Enter CPF");
            cpf = input.nextInt();
            System.out.println("Enter CRM");
            cpf = input.nextInt();
            System.out.println("Enter telephone number");
            number = input.nextInt();
        }
        catch(InputMismatchException e)
        {
            System.out.println("Wrong input");
        }
    }
}
