public class ObserverHexa extends Observer{

    public ObserverHexa(ConcreteSubject subject){
        this.subject = subject;
        this.subject.adicionarObserver(this);
    }

    @Override
    public void atualizarObservador() {
        System.out.println("String hexadecimal: " + Integer.toHexString(subject.getEstado()));        
    }
    
}
