import dto.BankAccount;

public class AppBank {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.setAccountNumber(272);
        bankAccount.setName("Andrea");
        bankAccount.setLastName("Ortiz");
        bankAccount.setActivated(true);


        System.out.println("Numero de cuenta "+bankAccount.getAccountNumber()+"\n"+
                "Propietario de la cuenta "+ bankAccount.getName() + " "+bankAccount.getLastName());
        bankAccount.statusAccount();
        bankAccount.disableAccount();
        bankAccount.statusAccount();

    }
}
