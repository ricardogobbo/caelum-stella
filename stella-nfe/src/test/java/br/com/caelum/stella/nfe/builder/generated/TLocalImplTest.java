package br.com.caelum.stella.nfe.builder.generated;

import br.com.caelum.stella.nfe.modelo.TUf;
import br.com.caelum.stella.tinytype.CNPJ;

public final class TLocalImplTest {
    @org.junit.Test
    public void testTLocalInterface() {
        TLocal tLocal = new TLocalImpl().withCNPJ(new CNPJ("abc")).withXLgr("abc").withNro("abc").withXCpl("abc").withXBairro(
                "abc").withCMun("abc").withXMun("abc").withUF(TUf.AC);
        assertModelWasFilled(tLocal);
    }

    private void assertModelWasFilled(final TLocal tLocal) {
        new br.com.caelum.stella.nfe.builder.BuilderTestHelper(tLocal).assertModelWasFilled();
    }
}