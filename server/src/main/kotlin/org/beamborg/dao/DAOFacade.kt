package org.beamborg.dao


import org.beamborg.models.*

interface DAOFacade {
    suspend fun allBeamSessions(): List<BeamSession>
    suspend fun beamSession(id: String): BeamSession?
    suspend fun addNewBeamSession(id: String, type: BeamSessionContentType?, content: String?): BeamSession
    suspend fun editBeamSession(id: String, type: BeamSessionContentType, content: String): Boolean
    suspend fun deleteBeamSession(id: String): Boolean

    suspend fun deleteAllBeamSessions(): Boolean
}