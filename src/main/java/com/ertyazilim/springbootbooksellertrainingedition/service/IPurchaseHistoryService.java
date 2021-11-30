package com.ertyazilim.springbootbooksellertrainingedition.service;

import com.ertyazilim.springbootbooksellertrainingedition.model.PurchaseHistory;
import com.ertyazilim.springbootbooksellertrainingedition.repository.projection.IPurchaseItem;

import java.util.List;

public interface IPurchaseHistoryService {
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
