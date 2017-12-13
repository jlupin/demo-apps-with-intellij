package com.example.currency.converter.service.impl;

import com.example.currency.converter.service.interfaces.CurrencyConverterChfService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;

@Api(
        description = "Currency Converter CHF API.",
        consumes = "application/json, application/xml, text/xml",
        produces = "application/json, application/xml"
)
@Service(value = "currencyConverterChfService")
public class CurrencyConverterChfServiceImpl extends CurrencyConverterServiceImpl implements CurrencyConverterChfService {
}