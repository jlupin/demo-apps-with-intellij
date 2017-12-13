package com.example.currency.converter.service.impl;

import com.example.currency.converter.service.interfaces.CurrencyConverterGbpService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;

@Api(
        description = "Currency Converter GBP API.",
        consumes = "application/json, application/xml, text/xml",
        produces = "application/json, application/xml"
)
@Service(value = "currencyConverterGbpService")
public class CurrencyConverterGbpServiceImpl extends CurrencyConverterServiceImpl implements CurrencyConverterGbpService {
}