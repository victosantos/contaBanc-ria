import java.math.BigDecimal;

public abstract class conta implements transacao{
    public void depositos(){
        System.out.println("Depósito realizado com sucesso.");
    }

    public void transferencia(){
        System.out.println("Transferência realizada com sucesso.");
    }

    public void saldo(){
        System.out.println("Saldo consultado com sucesso.");
    }

    public void saques(){
        System.out.println("Saque realizado com sucesso.");
    }

    public void pagamendoDeServicos(){
        System.out.println("Pagamento realizado com sucesso.");
    }

    @Override
    public boolean transacaoNaoOk() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean transacaoOk() {
        // TODO Auto-generated method stub
        return true;
    }
}
