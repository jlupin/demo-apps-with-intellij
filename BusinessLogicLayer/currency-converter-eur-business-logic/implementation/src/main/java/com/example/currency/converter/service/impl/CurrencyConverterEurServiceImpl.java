package com.example.currency.converter.service.impl;

import com.example.currency.converter.service.interfaces.CurrencyConverterEurService;
import io.swagger.annotations.Api;
import org.springframework.stereotype.Service;

@Api(
        description = "Currency Converter EUR API.",
        consumes = "application/json, application/xml, text/xml",
        produces = "application/json, application/xml"
)
@Service(value = "currencyConverterEurService")
public class CurrencyConverterEurServiceImpl extends CurrencyConverterServiceImpl implements CurrencyConverterEurService {
}