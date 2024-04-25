package edu.badpals;

import edu.badpals.RomanSymbols;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import edu.badpals.RegexRomanNumbers;

public class RomansNumber{

    private final String RomanNumber;
    private int numeroDecimal;
    private RegexRomanNumbers regexRomanNumbers = new RegexRomanNumbers();

    public RomansNumber(String numeroRomano){
        this.RomanNumber = numeroRomano;
    }

    public int toDecimal(){
        for (String regex : this.regexRomanNumbers.getRegularExpresions().values()){
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(RomanNumber);
            while (m.find()) {
                
                numeroDecimal += RomanSymbols.valueOf(m.group()).getdecimalValue();
            }
        }
        return numeroDecimal;
    }



}