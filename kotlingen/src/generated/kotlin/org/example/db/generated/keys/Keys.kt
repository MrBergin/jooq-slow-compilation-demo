/*
 * This file is generated by jOOQ.
 */
package org.example.db.generated.keys


import org.example.db.generated.tables.Actor
import org.example.db.generated.tables.Address
import org.example.db.generated.tables.Cars
import org.example.db.generated.tables.CarsStable
import org.example.db.generated.tables.Category
import org.example.db.generated.tables.City
import org.example.db.generated.tables.Country
import org.example.db.generated.tables.Customer
import org.example.db.generated.tables.Film
import org.example.db.generated.tables.FilmActor
import org.example.db.generated.tables.FilmCategory
import org.example.db.generated.tables.Inventory
import org.example.db.generated.tables.Language
import org.example.db.generated.tables.Payment
import org.example.db.generated.tables.Rental
import org.example.db.generated.tables.Staff
import org.example.db.generated.tables.Store
import org.example.db.generated.tables.records.ActorRecord
import org.example.db.generated.tables.records.AddressRecord
import org.example.db.generated.tables.records.CarsRecord
import org.example.db.generated.tables.records.CarsStableRecord
import org.example.db.generated.tables.records.CategoryRecord
import org.example.db.generated.tables.records.CityRecord
import org.example.db.generated.tables.records.CountryRecord
import org.example.db.generated.tables.records.CustomerRecord
import org.example.db.generated.tables.records.FilmActorRecord
import org.example.db.generated.tables.records.FilmCategoryRecord
import org.example.db.generated.tables.records.FilmRecord
import org.example.db.generated.tables.records.InventoryRecord
import org.example.db.generated.tables.records.LanguageRecord
import org.example.db.generated.tables.records.PaymentRecord
import org.example.db.generated.tables.records.RentalRecord
import org.example.db.generated.tables.records.StaffRecord
import org.example.db.generated.tables.records.StoreRecord
import org.jooq.ForeignKey
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val ACTOR_PKEY: UniqueKey<ActorRecord> = Internal.createUniqueKey(Actor.ACTOR, DSL.name("actor_pkey"), arrayOf(Actor.ACTOR.ACTOR_ID), true)
val ADDRESS_PKEY: UniqueKey<AddressRecord> = Internal.createUniqueKey(Address.ADDRESS, DSL.name("address_pkey"), arrayOf(Address.ADDRESS.ADDRESS_ID), true)
val CARS_PK: UniqueKey<CarsRecord> = Internal.createUniqueKey(Cars.CARS, DSL.name("cars_pk"), arrayOf(Cars.CARS.ID), true)
val CARS_STABLE_PK: UniqueKey<CarsStableRecord> = Internal.createUniqueKey(CarsStable.CARS_STABLE, DSL.name("cars_stable_pk"), arrayOf(CarsStable.CARS_STABLE.ID), true)
val CATEGORY_PKEY: UniqueKey<CategoryRecord> = Internal.createUniqueKey(Category.CATEGORY, DSL.name("category_pkey"), arrayOf(Category.CATEGORY.CATEGORY_ID), true)
val CITY_PKEY: UniqueKey<CityRecord> = Internal.createUniqueKey(City.CITY, DSL.name("city_pkey"), arrayOf(City.CITY.CITY_ID), true)
val COUNTRY_PKEY: UniqueKey<CountryRecord> = Internal.createUniqueKey(Country.COUNTRY, DSL.name("country_pkey"), arrayOf(Country.COUNTRY.COUNTRY_ID), true)
val CUSTOMER_PKEY: UniqueKey<CustomerRecord> = Internal.createUniqueKey(Customer.CUSTOMER, DSL.name("customer_pkey"), arrayOf(Customer.CUSTOMER.CUSTOMER_ID), true)
val FILM_PKEY: UniqueKey<FilmRecord> = Internal.createUniqueKey(Film.FILM, DSL.name("film_pkey"), arrayOf(Film.FILM.FILM_ID), true)
val FILM_ACTOR_PKEY: UniqueKey<FilmActorRecord> = Internal.createUniqueKey(FilmActor.FILM_ACTOR, DSL.name("film_actor_pkey"), arrayOf(FilmActor.FILM_ACTOR.ACTOR_ID, FilmActor.FILM_ACTOR.FILM_ID), true)
val FILM_CATEGORY_PKEY: UniqueKey<FilmCategoryRecord> = Internal.createUniqueKey(FilmCategory.FILM_CATEGORY, DSL.name("film_category_pkey"), arrayOf(FilmCategory.FILM_CATEGORY.FILM_ID, FilmCategory.FILM_CATEGORY.CATEGORY_ID), true)
val INVENTORY_PKEY: UniqueKey<InventoryRecord> = Internal.createUniqueKey(Inventory.INVENTORY, DSL.name("inventory_pkey"), arrayOf(Inventory.INVENTORY.INVENTORY_ID), true)
val LANGUAGE_PKEY: UniqueKey<LanguageRecord> = Internal.createUniqueKey(Language.LANGUAGE, DSL.name("language_pkey"), arrayOf(Language.LANGUAGE.LANGUAGE_ID), true)
val PAYMENT_PKEY: UniqueKey<PaymentRecord> = Internal.createUniqueKey(Payment.PAYMENT, DSL.name("payment_pkey"), arrayOf(Payment.PAYMENT.PAYMENT_ID), true)
val RENTAL_PKEY: UniqueKey<RentalRecord> = Internal.createUniqueKey(Rental.RENTAL, DSL.name("rental_pkey"), arrayOf(Rental.RENTAL.RENTAL_ID), true)
val STAFF_PKEY: UniqueKey<StaffRecord> = Internal.createUniqueKey(Staff.STAFF, DSL.name("staff_pkey"), arrayOf(Staff.STAFF.STAFF_ID), true)
val STORE_PKEY: UniqueKey<StoreRecord> = Internal.createUniqueKey(Store.STORE, DSL.name("store_pkey"), arrayOf(Store.STORE.STORE_ID), true)

// -------------------------------------------------------------------------
// FOREIGN KEY definitions
// -------------------------------------------------------------------------

val ADDRESS__FK_ADDRESS_CITY: ForeignKey<AddressRecord, CityRecord> = Internal.createForeignKey(Address.ADDRESS, DSL.name("fk_address_city"), arrayOf(Address.ADDRESS.CITY_ID), org.example.db.generated.keys.CITY_PKEY, arrayOf(City.CITY.CITY_ID), true)
val CITY__FK_CITY: ForeignKey<CityRecord, CountryRecord> = Internal.createForeignKey(City.CITY, DSL.name("fk_city"), arrayOf(City.CITY.COUNTRY_ID), org.example.db.generated.keys.COUNTRY_PKEY, arrayOf(Country.COUNTRY.COUNTRY_ID), true)
val CUSTOMER__CUSTOMER_ADDRESS_ID_FKEY: ForeignKey<CustomerRecord, AddressRecord> = Internal.createForeignKey(Customer.CUSTOMER, DSL.name("customer_address_id_fkey"), arrayOf(Customer.CUSTOMER.ADDRESS_ID), org.example.db.generated.keys.ADDRESS_PKEY, arrayOf(Address.ADDRESS.ADDRESS_ID), true)
val FILM__FILM_LANGUAGE_ID_FKEY: ForeignKey<FilmRecord, LanguageRecord> = Internal.createForeignKey(Film.FILM, DSL.name("film_language_id_fkey"), arrayOf(Film.FILM.LANGUAGE_ID), org.example.db.generated.keys.LANGUAGE_PKEY, arrayOf(Language.LANGUAGE.LANGUAGE_ID), true)
val FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY: ForeignKey<FilmActorRecord, ActorRecord> = Internal.createForeignKey(FilmActor.FILM_ACTOR, DSL.name("film_actor_actor_id_fkey"), arrayOf(FilmActor.FILM_ACTOR.ACTOR_ID), org.example.db.generated.keys.ACTOR_PKEY, arrayOf(Actor.ACTOR.ACTOR_ID), true)
val FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY: ForeignKey<FilmActorRecord, FilmRecord> = Internal.createForeignKey(FilmActor.FILM_ACTOR, DSL.name("film_actor_film_id_fkey"), arrayOf(FilmActor.FILM_ACTOR.FILM_ID), org.example.db.generated.keys.FILM_PKEY, arrayOf(Film.FILM.FILM_ID), true)
val FILM_CATEGORY__FILM_CATEGORY_CATEGORY_ID_FKEY: ForeignKey<FilmCategoryRecord, CategoryRecord> = Internal.createForeignKey(FilmCategory.FILM_CATEGORY, DSL.name("film_category_category_id_fkey"), arrayOf(FilmCategory.FILM_CATEGORY.CATEGORY_ID), org.example.db.generated.keys.CATEGORY_PKEY, arrayOf(Category.CATEGORY.CATEGORY_ID), true)
val FILM_CATEGORY__FILM_CATEGORY_FILM_ID_FKEY: ForeignKey<FilmCategoryRecord, FilmRecord> = Internal.createForeignKey(FilmCategory.FILM_CATEGORY, DSL.name("film_category_film_id_fkey"), arrayOf(FilmCategory.FILM_CATEGORY.FILM_ID), org.example.db.generated.keys.FILM_PKEY, arrayOf(Film.FILM.FILM_ID), true)
val INVENTORY__INVENTORY_FILM_ID_FKEY: ForeignKey<InventoryRecord, FilmRecord> = Internal.createForeignKey(Inventory.INVENTORY, DSL.name("inventory_film_id_fkey"), arrayOf(Inventory.INVENTORY.FILM_ID), org.example.db.generated.keys.FILM_PKEY, arrayOf(Film.FILM.FILM_ID), true)
val PAYMENT__PAYMENT_CUSTOMER_ID_FKEY: ForeignKey<PaymentRecord, CustomerRecord> = Internal.createForeignKey(Payment.PAYMENT, DSL.name("payment_customer_id_fkey"), arrayOf(Payment.PAYMENT.CUSTOMER_ID), org.example.db.generated.keys.CUSTOMER_PKEY, arrayOf(Customer.CUSTOMER.CUSTOMER_ID), true)
val PAYMENT__PAYMENT_RENTAL_ID_FKEY: ForeignKey<PaymentRecord, RentalRecord> = Internal.createForeignKey(Payment.PAYMENT, DSL.name("payment_rental_id_fkey"), arrayOf(Payment.PAYMENT.RENTAL_ID), org.example.db.generated.keys.RENTAL_PKEY, arrayOf(Rental.RENTAL.RENTAL_ID), true)
val PAYMENT__PAYMENT_STAFF_ID_FKEY: ForeignKey<PaymentRecord, StaffRecord> = Internal.createForeignKey(Payment.PAYMENT, DSL.name("payment_staff_id_fkey"), arrayOf(Payment.PAYMENT.STAFF_ID), org.example.db.generated.keys.STAFF_PKEY, arrayOf(Staff.STAFF.STAFF_ID), true)
val RENTAL__RENTAL_CUSTOMER_ID_FKEY: ForeignKey<RentalRecord, CustomerRecord> = Internal.createForeignKey(Rental.RENTAL, DSL.name("rental_customer_id_fkey"), arrayOf(Rental.RENTAL.CUSTOMER_ID), org.example.db.generated.keys.CUSTOMER_PKEY, arrayOf(Customer.CUSTOMER.CUSTOMER_ID), true)
val RENTAL__RENTAL_INVENTORY_ID_FKEY: ForeignKey<RentalRecord, InventoryRecord> = Internal.createForeignKey(Rental.RENTAL, DSL.name("rental_inventory_id_fkey"), arrayOf(Rental.RENTAL.INVENTORY_ID), org.example.db.generated.keys.INVENTORY_PKEY, arrayOf(Inventory.INVENTORY.INVENTORY_ID), true)
val RENTAL__RENTAL_STAFF_ID_KEY: ForeignKey<RentalRecord, StaffRecord> = Internal.createForeignKey(Rental.RENTAL, DSL.name("rental_staff_id_key"), arrayOf(Rental.RENTAL.STAFF_ID), org.example.db.generated.keys.STAFF_PKEY, arrayOf(Staff.STAFF.STAFF_ID), true)
val STAFF__STAFF_ADDRESS_ID_FKEY: ForeignKey<StaffRecord, AddressRecord> = Internal.createForeignKey(Staff.STAFF, DSL.name("staff_address_id_fkey"), arrayOf(Staff.STAFF.ADDRESS_ID), org.example.db.generated.keys.ADDRESS_PKEY, arrayOf(Address.ADDRESS.ADDRESS_ID), true)
val STORE__STORE_ADDRESS_ID_FKEY: ForeignKey<StoreRecord, AddressRecord> = Internal.createForeignKey(Store.STORE, DSL.name("store_address_id_fkey"), arrayOf(Store.STORE.ADDRESS_ID), org.example.db.generated.keys.ADDRESS_PKEY, arrayOf(Address.ADDRESS.ADDRESS_ID), true)
val STORE__STORE_MANAGER_STAFF_ID_FKEY: ForeignKey<StoreRecord, StaffRecord> = Internal.createForeignKey(Store.STORE, DSL.name("store_manager_staff_id_fkey"), arrayOf(Store.STORE.MANAGER_STAFF_ID), org.example.db.generated.keys.STAFF_PKEY, arrayOf(Staff.STAFF.STAFF_ID), true)
