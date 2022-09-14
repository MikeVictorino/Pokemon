package com.example.pokemon.util

interface DomainMapper <T, DomainModel> {

    fun mapToDomain(model: T): DomainModel

    fun mapFromDomainModel(domainModel: DomainModel): T


}