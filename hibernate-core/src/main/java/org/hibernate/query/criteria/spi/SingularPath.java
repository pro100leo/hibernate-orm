/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.query.criteria.spi;

/**
 * @author Steve Ebersole
 */
public interface SingularPath<T> extends PathImplementor<T> {
	@Override
	default  <R> R accept(JpaCriteriaVisitor visitor) {
		return visitor.visitSingularAttributePath( this );
	}
}
