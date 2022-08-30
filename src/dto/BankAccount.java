package dto;

/**
 * Clase BankAccount
 * @author Adrian Luengas
 */
public class BankAccount {
    private int accountNumber;
    public String name;
    public String lastName;
    protected boolean activated;

    /**
     * Permite devolver el nombre del usuario
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo que recibe nombre como parámetro
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Permite devolver el apellido del usuario
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Metodo que recibe apellido como parámetro
     * @param lastName
     */

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Método que permite devolver el numero de la cuenta
     * @return
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Método que recibe el numero de cuenta como parámetro
     * @param accountNumber
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Metodo que regresa el estado de la cuenta (true/false)
     * @return
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Este método recibe true o false como parámetro
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Metodo que informa el estado de la cuenta con su respectivo usuario
     */
    public void statusAccount(){
        System.out.println("La cuenta numero "+this.accountNumber + " está asociado a el usuario "+this.name+" "
                +this.lastName+ " se encuentra en estado "+status());
    }

    /**
     * Este metodo que retorna el estado en el cual se encuentra la cuenta
     * @return
     */
    public String status(){
        String msg;
        if(this.activated){
            msg = "activada";
        }else {
            msg= "desactivada";
        }
        return msg;
    }

    /**
     * Metodo que permite deshabilitar el estado de la cuenta
     */
    public void disableAccount(){
        activated=false;
    }
}
