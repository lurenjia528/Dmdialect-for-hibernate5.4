package org.hibernate.dialect.identity;

/**
 * @author yanggt
 * @date 2022-01-24
 */
public class DMIdentityColumnSupport extends IdentityColumnSupportImpl {
	@Override
	public boolean supportsIdentityColumns() {
		return true;
	}

	@Override
	public String getIdentitySelectString(String table, String column, int type) {
		return "select scope_identity()";
	}

	@Override
	public String getIdentityColumnString(int type) {
		return "identity not null";
	}
}