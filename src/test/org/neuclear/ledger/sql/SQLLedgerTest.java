package org.neuclear.ledger.sql;

import org.neuclear.commons.NeuClearException;
import org.neuclear.commons.sql.DefaultConnectionSource;
import org.neuclear.commons.sql.statements.SimpleStatementFactory;
import org.neuclear.ledger.AbstractLedgerTest;
import org.neuclear.ledger.Ledger;
import org.neuclear.ledger.LowlevelLedgerException;
import org.neuclear.ledger.UnknownLedgerException;

import javax.naming.NamingException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: pelleb
 * Date: Jul 16, 2003
 * Time: 12:58:30 PM
 * To change this template use Options | File Templates.
 */
public final class SQLLedgerTest extends AbstractLedgerTest {
    public SQLLedgerTest(final String s) throws LowlevelLedgerException, UnknownLedgerException, SQLException, NamingException, IOException, NeuClearException {
        super(s);
    }

    public final Ledger createLedger() throws UnknownLedgerException, LowlevelLedgerException {
        return new SQLLedger(new SimpleStatementFactory(new DefaultConnectionSource()), "test");
    }


}
