package joc2048;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Casella.class)
public abstract class Casella_ {

	public static volatile SingularAttribute<Casella, Long> id;
	public static volatile SingularAttribute<Casella, Integer> numeroColumna;
	public static volatile SingularAttribute<Casella, Integer> numeroFila;
	public static volatile SingularAttribute<Casella, ClauCasella> clauCasella;
	public static volatile SingularAttribute<Casella, Integer> numero;

}

