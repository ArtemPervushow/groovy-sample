import org.junit.Test

class ExpandoSample {
    static {
        Utility.metaClass.expandoWork {->
            delegate.calculate() - 100
        }
    }

    @Test
    void testExpando(){
        Utility utility = new Utility(value: "20", param: 500)
        assert utility.expandoWork() == 420
    }
}
