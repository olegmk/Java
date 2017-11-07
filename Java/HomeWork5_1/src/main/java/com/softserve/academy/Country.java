package com.softserve.academy;

public class Country {
    private String country;

    public Country(){
        country = "Ukraine";
    }

    public Country (String country){
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean equals(Object obj)
    {
        if(obj == this)
            return true;

     /* obj ссылается на null */

        if(obj == null)
            return false;

     /* Удостоверимся, что ссылки имеют тот же самый тип */

        if(!(getClass() == obj.getClass()))
            return false;
        else
        {
            Country tmp = (Country) obj;
            if(tmp.country == this.country)
                return true;
            else
                return false;
        }
    }
}
