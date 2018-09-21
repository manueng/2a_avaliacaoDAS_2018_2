package CalculodeRendimentoBruto;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
@RunWith(Parameterized.class)
public class Testcalculorendimentobruto {
   Double periodo, valor, taxa,expected;	
   @Test 
   public  void testCalculororendimentoBruto() {
	   Calcularendimento calc= new Calcularendimento();
	   assertEquals(13.97,calc.calcularendimentobruto(60.00,1000.00,0.085),0.20); 
   }
   @Test
   public void testCalculororendimento2() {
	   Calcularendimento calc2= new Calcularendimento();
	   assertEquals(13.15,calc2.calcularendimentobruto(120.00,500.00,0.08),0.20);
   }
   @Parameters
   public Collection<Object>test(){
	   return Array.asList({60.00,1000.00,0.085,13.97},
			   {120.00,500.00,0.08,13.15} );
	   
   }
   public Testcalculorendimentobruto(double periodo, double valor, double taxa, double expected) {
	   this.periodo=periodo;
	   this.valor=valor;
	   this.taxa=taxa;
	   this.expected=expected;
   }
   @Test
   public void testCalculororendimento3() {
	   Calcularendimento calc3= new Calcularendimento();
	   assertEquals(this.expected, calc3.calcularendimentobruto(this.periodo,this.valor,this.taxa),0.2);
   }

}
