package com.ert.springbootbooksellerlearningedition.service;

import com.ert.springbootbooksellerlearningedition.model.PurchaseHistory;
import com.ert.springbootbooksellerlearningedition.repository.projection.IPurchaseItem;

import java.util.List;

/**
 * @author sa
 * @date 3.07.2021
 * @time 18:14
 */
public interface IPurchaseHistoryService
{
    PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory);

    List<IPurchaseItem> findPurchasedItemsOfUser(Long userId);
}
