package main.java.es.ies.puerto.mapper;

import es.ies.puerto.modelo.db.entidades.Alias;
import main.java.es.ies.puerto.intercambio.AliasInt;

 public  class  MapperAlias {


    public static Alias AliasIntToAlias(AliasInt aliasInt){
        Alias alias;
        if (aliasInt==null) {
            return null;
        }

        alias = new Alias();
        alias.setId(aliasInt.getId());
        alias.setDescripcion(aliasInt.getDescripcion());
        return alias;
    }


    public static AliasInt AliasToAliasInt(Alias alias){
        AliasInt aliasInt;
        if (alias==null) {
            return null;
        }

        aliasInt = new AliasInt();
        aliasInt.setId(alias.getId());
        aliasInt.setDescripcion(alias.getDescripcion());
        return aliasInt;
    }
}
