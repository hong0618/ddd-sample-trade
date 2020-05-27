package com.company.department.business.order.present.web.request;

import com.company.department.business.order.application.command.TradeBuyCommand;
import lombok.Data;
import org.springframework.ext.common.helper.BeanHelper;

import java.util.List;

/**
 * @author only
 * @since 2020-05-22
 */
@Data
public class TradeBuyRequest {
    /** 买家id */
    private Long buyerId;
    /** 商品id */
    private Long goodsId;
    /** 商品件数 */
    private Long itemCount;

    public TradeBuyCommand asCommand() {
        TradeBuyCommand command = BeanHelper.copyProperties(new TradeBuyCommand(), this);
        return command;
    }
}
