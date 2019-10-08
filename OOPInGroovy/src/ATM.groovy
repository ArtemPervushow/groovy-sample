class ATM {
    //Пользуясь методами расширения из ООП groovy добавить следующий функционал
    //не меняя код самого класса банкомата
    //1. За весь день нельзя снять больше N-денег
    //2. За весь день нельзя сделать больше M-операций
    //3. Добавить в банкомат проверку текущего пользователя по логину-паролю
    BigDecimal balance
    Date currentDate

    BigDecimal widrawMoney(BigDecimal money){
        if(balance < money || money <=0 )
            throw new IllegalArgumentException()

        balance -= money
        money
    }

    void inputMoney(BigDecimal money){
        if(money <= 0)
            throw  new IllegalArgumentException()

        balance+=money
    }
}
