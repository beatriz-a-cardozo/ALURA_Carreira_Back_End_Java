public class Client {

    private String name;
    private String accountType;
    private double balance;

    public Client(String name, String accountType, double balance) {
        this.name = name;
        this.accountType = accountType;
        this.balance = balance;
    }

    public String consultBalance() {
        return "    Saldo atual: R$ " + this.balance;
    }

    public String receiveMoney(double money) {
        this.balance += money;

        return "    Recebimento realizado com sucesso!";
    }

    public String transferMoney(double money) {
        if (this.balance > money) {
            this.balance -= money;
            return "    Transferencia realizada com sucesso!";
        } else {
            return "    Transferencia abortada: Saldo insuficiente!";
        }
    }

    @Override
    public String toString() {
        return """
                 ========================================
                                                            
                     CLIENTE :: %s                             
                     TIPO DA CONTA :: %s                       
                                                            
                     SALDO :: %f                    
                                
                 ========================================
        """.formatted(this.name, this.accountType, this.balance);
    }
}
