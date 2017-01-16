package org.thingsboard.gateway.extensions.opc.conf.mapping;

import lombok.Data;

/**
 * Created by ashvayka on 16.01.17.
 */
@Data
public class KVMapping {
    private String key;
    private String type;
    private String value;
}
