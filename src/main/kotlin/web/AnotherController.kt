package web

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import util.Application
//import util.Constants.Companion
import util.Constants.Companion.BLABLA_BASE
import util.Constants.Companion.SECONDS_BASE
import util.Constants2
import util.Constants2.MyObject
import util.Routes

@RestController
@RequestMapping
class SomeController {
    @PostMapping(Routes.update)
    @ResponseStatus(HttpStatus.OK)
    fun updateLoginFunc(
        @PathVariable("loginNumber") loginNumber: Int,
    ): String = "Login number updated: $loginNumber"

    @PostMapping(Routes.deleteUser)
    @ResponseStatus(HttpStatus.OK)
    fun postUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"


    @DeleteMapping(Application.SECURED_BASE)
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(Application.INTERNAL_BASE)
    @ResponseStatus(HttpStatus.OK)
    fun deleteInternalUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

//    @DeleteMapping(Companion.BLABLA_BASE)
//    @ResponseStatus(HttpStatus.OK)
//    fun blablaUser22(
//        @PathVariable("id") userId: Int,
//    ):  String = "Deleted user: $userId"

    @DeleteMapping(BLABLA_BASE)
    @ResponseStatus(HttpStatus.OK)
    fun blablaUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(SECONDS_BASE)
    @ResponseStatus(HttpStatus.OK)
    fun deleteSecondUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(MyObject.HELLO)
    @ResponseStatus(HttpStatus.OK)
    fun deleteRandomUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(Constants2.WORLD)
    @ResponseStatus(HttpStatus.OK)
    fun deleteAnotherUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

    @DeleteMapping(Constants2.WORLD)
    @ResponseStatus(HttpStatus.OK)
    fun deleteLastUser(
        @PathVariable("id") userId: Int,
    ):  String = "Deleted user: $userId"

}
