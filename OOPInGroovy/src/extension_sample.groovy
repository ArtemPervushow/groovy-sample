class UtilityExtension{
    static Integer extensionWork(Utility self){
        println "this is extension method"
        self.calculate() + 10
    }
}

use(UtilityExtension){
    Utility utility = new Utility(value: "10", param: 100)
    assert utility.extensionWork() == 120
}