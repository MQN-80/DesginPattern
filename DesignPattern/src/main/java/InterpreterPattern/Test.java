package InterpreterPattern;

public class Test {
    //规则：可以询问Banlie,natursun,adidas在哪
    public static Expression whereExpression(){
        Expression Banlie = new TerminalExpression("Banlie");
        Expression natursun = new TerminalExpression("natursun");
        Expression adidas = new TerminalExpression("adidas");
        return new WhereExpression(Banlie, natursun,adidas);
    }

    //规则：十号线和万达广场在一起
    public static Expression togetherExpression(){
        Expression ten = new TerminalExpression("ten");
        Expression wanda = new TerminalExpression("wanda");
        return new TogetherExpression(ten, wanda);
    }

    public static void main(String[] args){
        Expression where = whereExpression();
        Expression together = togetherExpression();

        System.out.println("语音助手可以判断提问是否能被识别：");
        System.out.println("Where is adidas? " + where.interpret("adidas"));
        System.out.println("Where is America? "+ where.interpret("America"));
        System.out.println("Is ten together with wanda? " + together.interpret("ten wanda"));
    }
}
