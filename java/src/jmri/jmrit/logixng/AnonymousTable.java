package jmri.jmrit.logixng;

import jmri.NamedBean;

/**
 * Represent an anonymous table.
 * An anonymous table has no name. It can be assigned to a Memory or to a cell
 * in a table but cannot be stored in an xml file. It's used as a temporary
 * storage during execution of JMRI.
 *
 * @author Daniel Bergqvist Copyright (C) 2019
 */
public interface AnonymousTable extends Table, NamedBean {
}
