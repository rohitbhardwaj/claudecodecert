package com.acme.checkout.batch;

import com.acme.checkout.service.CancellationService;

public class BatchOrderProcessor {
    private final CancellationService cancellationService;

    public BatchOrderProcessor(CancellationService cancellationService) {
        this.cancellationService = cancellationService;
    }

    public String cancelFromBatch(String orderId) {
        return cancellationService.cancel(orderId, "BATCH");
    }
}
