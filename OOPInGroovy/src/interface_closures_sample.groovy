lamb = [hasNext: {lamb.value > 0}, next: {lamb.value--}]
lamb.value = 10

def iter = lamb as Iterator
while (iter.hasNext()){
    println(iter.next())
}

Calculator calc = new CalculatorImpl()

calcLambd = [plus: {Object a, Object b  -> println("plus"); calc.plus(a, b)},
             minus: {Object a, Object b  -> println("minus"); calc.minus(a, b)},
             multy: {Object a, Object b  -> println("multy"); calc.multy(a, b)},
             divide: {Object a, Object b ->println("divide"); calc.divide(a, b)}]

Calculator newCalc = calcLambd as Calculator

def result = newCalc.plus(10,80)

println(result)