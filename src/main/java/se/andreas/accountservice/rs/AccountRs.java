package se.andreas.accountservice.rs;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import se.andreas.accountservice.dto.Account;
import se.andreas.accountservice.dto.AccountRole;
import se.andreas.accountservice.dto.Status;

import static se.andreas.accountservice.dto.AccountRole.Role.CO_OWNER;
import static se.andreas.accountservice.dto.AccountRole.Role.OWNER;

@RestController
@RequestMapping("account")
public class AccountRs {

    @GetMapping("{id}")
    public Account getAccount(@PathVariable Integer id) {
        Account account = new Account("Sparkonto");
        account.getBusinessObjects().add(new AccountRole("Andreas", OWNER));
        account.getBusinessObjects().add(new AccountRole("Kalle", CO_OWNER));
        account.getBusinessObjects().add(new Status(Status.StatusType.ACTIVE));
        return account;
    }

}
