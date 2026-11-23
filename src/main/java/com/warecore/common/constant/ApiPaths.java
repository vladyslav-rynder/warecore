package com.warecore.common.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ApiPaths {
    public final String BASE_API = "/api";

    public final String LOGIN = BASE_API + "/login";
    public final String CURRENT_USER = BASE_API + "/current-user";
    public final String USERS = BASE_API + "/users";

    public final String ZONES = BASE_API + "/zones";
    public final String RACKS = BASE_API + "/racks";
    public final String STORAGE_BINS = BASE_API + "/storage-bins";

    public final String PRODUCTS = BASE_API + "/products";

    public final String INVENTORY = BASE_API + "/inventory";
    public final String STOCK_MOVEMENTS = BASE_API + "/stock-movements";
    public final String GOODS_RECEIPTS = BASE_API + "/goods-receipts";
    public final String CYCLE_COUNTS = BASE_API + "/cycle-counts";
    public final String OUTBOUND_ORDERS = BASE_API + "/outbound-orders";

    public final String AUDIT_LOGS = BASE_API + "/audit-logs";
}