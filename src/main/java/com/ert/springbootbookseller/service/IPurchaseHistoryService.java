package com.ert.springbootbookseller.service;

import com.ert.springbootbookseller.model.PurchaseHistory;
import com.ert.springbootbookseller.repository.projection.IPurchaseItem;

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
