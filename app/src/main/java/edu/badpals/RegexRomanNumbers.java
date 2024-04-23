package edu.badpals;

import java.util.Map;

public class RegexRomanNumbers{

    public Map<String, String> regularExpresions = new HashMap<>(); 

    public RegexRomanNumbers(){
        regularExpresions.put("grupoSumatorio", "(?<!I)[XV](?![LC])|(?<!X)[LC](?!MD)|(?<!C)[MD]|I(?![VX])")
                        .put("grupoSustractivo", "I[XV]|X[CL]|C[DM]"); 
    }

    
    public Map<String, String> getRegularExpresions() {
        return regularExpresions;
    }
}