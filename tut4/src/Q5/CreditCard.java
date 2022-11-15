package Q5;

import javax.smartcardio.ATR;
import javax.smartcardio.Card;
import javax.smartcardio.CardChannel;
import javax.smartcardio.CardException;

public class CreditCard extends Card {
    private int pinNumber;
    private int number;
    public boolean isExpired() {
// assume credit cards never expire


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

