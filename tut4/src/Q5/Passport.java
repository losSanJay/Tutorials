package Q5;

import javax.smartcardio.ATR;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Passport extends Card {
    private String birthLocation;
    private int expirationYear;
    public boolean isExpired() {
// find out the current year
        GregorianCalendar calendar = new GregorianCalendar();
        int current_year = calendar.get(Calendar.YEAR);
        if (expirationYear < current_year)
            return true;
        else
            return false;
    }

    @Override
    public ATR getATR() {
        return null;
    }

    @Override
    public String getProtocol() {
        return null;
    }

    @Override
    public CardChannel getBasicChannel() {
        return null;
    }

    @Override
    public CardChannel openLogicalChannel() throws CardException {
        return null;
    }

    @Override
    public void beginExclusive() throws CardException {

    }

    @Override
    public void endExclusive() throws CardException {

    }

    @Override
    public byte[] transmitControlCommand(int controlCode, byte[] command) throws CardException {
        return new byte[0];
    }

    @Override
    public void disconnect(boolean reset) throws CardException {

    }
}
