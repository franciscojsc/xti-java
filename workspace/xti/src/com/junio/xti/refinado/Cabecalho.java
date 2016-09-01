package com.junio.xti.refinado;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.TYPE)

public @interface Cabecalho {

	String instituição();
	String projeto();
	String dataDeCriado();
	String criador();
	int revisao() default 1;

}
