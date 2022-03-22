package se.andreas.accountservice.rs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.andreas.accountservice.dto.Account;
import se.andreas.accountservice.dto.BalanceInformation;
import se.andreas.accountservice.dto.RoleInformation;
import se.andreas.accountservice.dto.StatusInformation;

import java.math.BigDecimal;

import static se.andreas.accountservice.dto.RoleInformation.Role.CO_OWNER;
import static se.andreas.accountservice.dto.RoleInformation.Role.OWNER;

@RestController
@RequestMapping("account")
public class AccountRs {

    @GetMapping("{id}")
    public Account getAccount(@PathVariable Integer id) {
        Account account = new Account("Sparkonto");
        account.getBusinessObjects().add(new RoleInformation("Andreas", OWNER));
        account.getBusinessObjects().add(new BalanceInformation(BigDecimal.valueOf(4500.0), "sek", BigDecimal.valueOf(0.05)));
        account.getBusinessObjects().add(new RoleInformation("Kalle", CO_OWNER));
        account.getBusinessObjects().add(new StatusInformation(StatusInformation.Status.ACTIVE));
        return account;
    }

}
