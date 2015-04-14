package joc2048;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Partida.class)
public abstract class Partida_ {

	public static volatile SingularAttribute<Partida, Long> id;
	public static volatile SingularAttribute<Partida, Boolean> estaAcabada;
	public static volatile SingularAttribute<Partida, Integer> idPartida;
	public static volatile CollectionAttribute<Partida, Casella> caselles;
	public static volatile SingularAttribute<Partida, Boolean> estaGuanyada;
	public static volatile SingularAttribute<Partida, Integer> puntuacio;

}

